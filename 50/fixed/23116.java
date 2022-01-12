@java.lang.Deprecated
public static java.lang.String getMaxPortStrOld(java.lang.String ip, int sshPort) throws com.sohu.cache.exception.SSHException {
    java.lang.String redisPidCmd = "ps -ef | grep redis | grep -v 'grep' |  awk -F '*:' '{print $2}' " + " | awk -F ' ' '{print $1}' | sort -r | head -1";
    return com.sohu.cache.ssh.SSHUtil.execute(ip, redisPidCmd);
}