@java.lang.Override
public boolean apply(@javax.annotation.Nullable
com.gmi.nordborglab.browser.shared.proxy.TraitProxy input) {
    if (input == null)
        return true;
    
    boolean isNotFound = true;
    for (com.gmi.nordborglab.browser.shared.proxy.AlleleAssayProxy alleleAssay : input.getObsUnit().getStock().getPassport().getAlleleAssays()) {
        if (alleleAssay.getId().equals(selectedAlleleAssay.getId())) {
            isNotFound = false;
            break;
        }
    }
    return isNotFound;
}