public static data.Data getInstance() {
    if ((data.Data.instance) == null) {
        data.Data.instance = new data.Data();
    }
    return data.Data.instance;
}