public static void extract(crispy_octo_moo.extractor.Snap415FBPost fbPost, crispy_octo_moo.extractor.ExtractedData container) {
    java.lang.String story = fbPost.getStory();
    if ((story.trim().length()) > 0) {
        java.lang.String storyLowerCase = story.toLowerCase();
        crispy_octo_moo.extractor.PostExtractor.extractChild(fbPost, storyLowerCase, container);
        crispy_octo_moo.extractor.PostExtractor.extractElectricVehicle(fbPost, storyLowerCase, container);
        crispy_octo_moo.extractor.PostExtractor.extractMarriageStatus(fbPost, storyLowerCase, container);
    }
}