public static byte[][] toByteRepresentation(lucee.runtime.type.scope.storage.IKStorageValue val) throws lucee.runtime.exp.PageException {
    return new byte[][]{ val.barr , lucee.commons.lang.NumberUtil.longToByteArray(val.lastModified) };
}