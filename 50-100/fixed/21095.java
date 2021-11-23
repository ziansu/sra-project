public static java.lang.String normalizePhone(java.lang.String phoneNumber) {
    if (phoneNumber == null)
        return "";
    
    if ((android.os.Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.LOLLIPOP)) {
        java.lang.String e164 = android.telephony.PhoneNumberUtils.formatNumberToE164(phoneNumber, fr.neamar.kiss.normalizer.PhoneNormalizer.instance.countryIso);
        if (e164 != null) {
            return android.telephony.PhoneNumberUtils.formatNumber(e164, fr.neamar.kiss.normalizer.PhoneNormalizer.instance.countryIso);
        }
    }
    java.lang.String result = android.telephony.PhoneNumberUtils.formatNumber(fr.neamar.kiss.normalizer.PhoneNormalizer.instance.toE164(phoneNumber));
    return result;
}