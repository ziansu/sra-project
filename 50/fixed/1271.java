private static void runMany(no.uio.ifi.qure.Config[] configs) {
    for (int i = 0; i < (configs.length); i++)
        no.uio.ifi.qure.Qure.runBulk(configs[i]);
    
}