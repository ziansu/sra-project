public static boolean addEnv(xyz.scottz.scottpz.Environment env) {
    if ((xyz.scottz.scottpz.GridLogic.envs) == null) {
        xyz.scottz.scottpz.GridLogic.envs = new java.util.ArrayList<xyz.scottz.scottpz.Environment>();
    }
    xyz.scottz.scottpz.GridLogic.envs.add(env);
    return true;
}