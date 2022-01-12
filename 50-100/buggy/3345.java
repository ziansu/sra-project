public static void main(java.lang.String[] args) throws java.lang.Throwable {
    com.anji.util.Properties props = new com.anji.util.Properties("marioAuto.properties");
    bachelor.MarioTrainer.ff.init(props);
    bachelor.MarioTrainer.ff.levelOptions = "-mix 16 -miy 223 -ld 1";
    bachelor.MarioTrainer.ff.generation = 0;
    try {
        bachelor.MarioTrainer mT = new bachelor.MarioTrainer();
        mT.init(props);
        mT.trainDistanceTraveled();
    } catch (java.lang.Throwable th) {
        java.lang.System.out.println(th);
    }
}