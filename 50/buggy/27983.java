public void init(java.lang.String levelName) {
    this.levelName = levelName;
    switch (levelName) {
        case "test" :
            createTestMap();
            break;
        case "demo" :
            createDemoMap();
            break;
    }
}