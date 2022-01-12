public static void main(java.lang.String[] args) {
    net.sparkzz.test.Test.logger = new net.sparkzz.modest.utils.Logger("Test");
    net.sparkzz.modest.io.config.Config config = new net.sparkzz.modest.io.config.YAMLConfig();
    config.set("Horse", "DEAD HORSE D:");
    config.set("Health", 20);
    java.lang.System.out.println(config.getBoolean("Health"));
    config.save();
    java.lang.System.exit(0);
}