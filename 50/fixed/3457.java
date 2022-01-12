public static br.ufpe.cin.Properties getInstance() {
    if ((br.ufpe.cin.Properties.instance) == null) {
        br.ufpe.cin.Properties.instance = new br.ufpe.cin.Properties();
    }
    return br.ufpe.cin.Properties.instance;
}