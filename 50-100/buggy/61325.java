public static <T extends org.toradocu.extractor.Tag> void translate(T tag, org.toradocu.extractor.DocumentedMethod excMember) {
    org.toradocu.translator.preprocess.PreprocessorFactory.create(tag.getKind()).preprocess(tag, excMember);
    final org.toradocu.translator.Translator<? extends org.toradocu.extractor.Tag> translator = org.toradocu.translator.TranslatorFactory.create(tag.getKind());
    org.toradocu.translator.spec.Specification spec = translator.translate(tag, excMember);
}