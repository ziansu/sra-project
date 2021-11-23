public static util.serialization.GlobalUniquenessSerializer getInstance() {
    if ((util.serialization.GlobalUniquenessSerializer.instance) != null) {
        return util.serialization.GlobalUniquenessSerializer.instance;
    }
    return new util.serialization.GlobalUniquenessSerializer();
}