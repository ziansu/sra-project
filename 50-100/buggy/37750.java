public static java.lang.String normalizePhone(java.lang.String phoneNumber) {
    if (phoneNumber == null)
        return "";
    
    if ((android.os.Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.LOLLIPOP)) {
        return android.telephony.PhoneNumberUtils.formatNumberToE164(phoneNumber, fr.neamar.kiss.normalizer.PhoneNormalizer.instance.countryIso);
    }else {
        return android.telephony.PhoneNumberUtils.formatNumber(fr.neamar.kiss.normalizer.PhoneNormalizer.instance.toE164(phoneNumber));
    }
}