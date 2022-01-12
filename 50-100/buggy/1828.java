public static java.lang.String encode(java.lang.String value) {
    if (net.anotheria.util.StringUtils.isEmpty(value))
        throw new java.lang.IllegalArgumentException("value is not valid");
    
    java.lang.String toEncrypt = ((((net.anotheria.anosite.photoserver.shared.IdCrypter.SECRET_CONSTANT) + (net.anotheria.anosite.photoserver.shared.IdCrypter.DELIMITER)) + value) + (net.anotheria.anosite.photoserver.shared.IdCrypter.DELIMITER)) + (net.anotheria.util.NumberUtils.itoa(net.anotheria.anosite.photoserver.shared.IdCrypter.rnd.nextInt(net.anotheria.anosite.photoserver.shared.IdCrypter.RANDOM_BASE), 3));
    return net.anotheria.anosite.photoserver.shared.IdCrypter.crypt.encryptToHex(toEncrypt);
}