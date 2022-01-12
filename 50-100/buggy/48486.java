public void addDietTags(java.util.List<dev.blunch.blunch.domain.DietTags> dietTags) {
    for (dev.blunch.blunch.domain.DietTags dietTag : dietTags) {
        if (dietTag.equals(""))
            this.dietTags += dietTag.toString();
        else
            this.dietTags += "&" + (dietTag.toString());
        
    }
}