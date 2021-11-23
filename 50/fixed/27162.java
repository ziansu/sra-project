@java.lang.Deprecated
public static boolean isIdentityCardDigitControlFormatValid(final java.lang.String extraValue) {
    return (org.fenixedu.ulisboa.specifications.util.IdentityCardUtils.isBilheteIdentidadeDigitControlFormatValid(extraValue)) || (org.fenixedu.ulisboa.specifications.util.IdentityCardUtils.isCartaoCidadaoDigitControlFormatValid(extraValue));
}