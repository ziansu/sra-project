public static byte[][] toByteRepresentation(lucee.runtime.type.scope.storage.IKStorageValue val) throws lucee.runtime.exp.PageException {
    byte[] barr = val.barr;
    return new byte[][]{ barr , lucee.commons.lang.NumberUtil.longToByteArray(val.lastModified) };
}