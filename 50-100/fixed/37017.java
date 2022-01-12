@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (obj == (this)) {
        return true;
    }
    org.javamoney.moneta.convert.DefaultExchangeRate other = ((org.javamoney.moneta.convert.DefaultExchangeRate) (obj));
    return (((java.util.Objects.equals(base, other.base)) && (java.util.Objects.equals(conversionContext, other.conversionContext))) && ((factor.compareTo(other.factor)) == 0)) && (java.util.Objects.equals(term, other.term));
}