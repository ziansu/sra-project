@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (obj == (this)) {
        return true;
    }
    if (obj instanceof org.javamoney.moneta.convert.DefaultExchangeRate) {
        org.javamoney.moneta.convert.DefaultExchangeRate other = ((org.javamoney.moneta.convert.DefaultExchangeRate) (obj));
        return (((java.util.Objects.equals(base, other.base)) && (java.util.Objects.equals(conversionContext, other.conversionContext))) && (java.util.Objects.equals(factor, other.factor))) && (java.util.Objects.equals(term, other.term));
    }
    return false;
}