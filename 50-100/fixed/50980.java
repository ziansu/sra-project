public no.difi.meldingsutveksling.ptp.KontaktInfo getCitizenInfo(no.difi.meldingsutveksling.serviceregistry.krr.LookupParameters lookupParameters) {
    no.difi.meldingsutveksling.ptp.KontaktInfo kontaktInfo = client.hentKontaktInformasjon(lookupParameters);
    if ((!(kontaktInfo.canReceiveDigitalPost())) || ((!(kontaktInfo.isNotifiable())) || (lookupParameters.isObligatedToBeNotified()))) {
        kontaktInfo.setPrintDetails(client.getPrintProviderDetails(lookupParameters));
    }
    return kontaktInfo;
}