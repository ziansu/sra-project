public static cn.alphabets.light.exception.DataRiderException EntityClassNotFound(java.lang.String clazz, cn.alphabets.light.entity.ModBoard board) {
    return new cn.alphabets.light.exception.DataRiderException(java.lang.String.format("Can not found class : %s , board : %s", clazz, board.toDocument().toJson()));
}