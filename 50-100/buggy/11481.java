@java.lang.Override
public boolean equals(final java.lang.Object o) {
    if (o == (this))
        return true;
    
    if (!(super.equals(o)))
        return false;
    
    final com.helger.photon.core.ajax.response.AjaxHtmlResponse rhs = ((com.helger.photon.core.ajax.response.AjaxHtmlResponse) (o));
    return (com.helger.commons.equals.EqualsHelper.equals(m_sErrorMessage, rhs.m_sErrorMessage)) && (com.helger.commons.equals.EqualsHelper.equals(m_aSuccessValue, rhs.m_aSuccessValue));
}