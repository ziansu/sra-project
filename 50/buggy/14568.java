@java.lang.Override
public void initialize(de.tudarmstadt.ukp.dkpro.core.snowball.UimaContext aContext) throws org.apache.uima.resource.ResourceInitializationException {
    super.initialize(aContext);
    if (!(org.apache.commons.lang.StringUtils.isBlank(language))) {
        language = de.tudarmstadt.ukp.dkpro.core.snowball.SnowballStemmer.languages.get(language);
    }
}