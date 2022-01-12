@java.lang.Override
public pl.jcrusader.cytatdnia.dto.QuoteDto getLocallyStoredQuoteForToday() {
    if (wasQuoteDownloadedToday()) {
        android.content.SharedPreferences sharedPreferences = getPreferences();
        java.lang.String author = sharedPreferences.getString(pl.jcrusader.cytatdnia.service.impl.LocalQuoteDataServiceImpl.AUTHOR_KEY, "");
        java.lang.String quote = sharedPreferences.getString(pl.jcrusader.cytatdnia.service.impl.LocalQuoteDataServiceImpl.QUOTE_KEY, "");
        return new pl.jcrusader.cytatdnia.dto.QuoteDto(author, quote);
    }
    return null;
}