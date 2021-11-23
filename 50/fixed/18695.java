public static util.serialization.GlobalUniquenessSerializer getInstance() {
    if ((util.serialization.GlobalUniquenessSerializer.instance) == null) {
        util.serialization.GlobalUniquenessSerializer.instance = new util.serialization.GlobalUniquenessSerializer();
    }
    return util.serialization.GlobalUniquenessSerializer.instance;
}