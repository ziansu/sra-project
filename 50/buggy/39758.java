public void populate() {
    switch (levelName) {
        case "test" :
            populateTestMap();
            break;
        case "demo" :
            populateDemoMap();
            break;
    }
}