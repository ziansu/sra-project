@java.lang.Override
public boolean apply(@javax.annotation.Nullable
com.gmi.nordborglab.browser.shared.proxy.TraitProxy input) {
    if (input == null)
        return false;
    
    boolean isFound = false;
    for (com.gmi.nordborglab.browser.shared.proxy.AlleleAssayProxy alleleAssay : input.getObsUnit().getStock().getPassport().getAlleleAssays()) {
        if (alleleAssay.getId().equals(selectedAlleleAssay.getId())) {
            isFound = true;
            break;
        }
    }
    return isFound;
}