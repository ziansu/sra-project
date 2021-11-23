public static java.lang.String TokenHash(de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Token tk) {
    if (((tk.getLemma()) == null) || (tk.getLemma().getValue().isEmpty())) {
        return Constants.INVALID_HASH;
    }
    return org.springframework.util.DigestUtils.md5DigestAsHex(tk.getLemma().getValue().getBytes());
}