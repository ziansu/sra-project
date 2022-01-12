private void processPersonTag(edu.emory.clir.clearnlp.coreference.mention.proper.ProperNoun properNoun) {
    properNoun.e_type = edu.emory.clir.clearnlp.coreference.type.EntityType.PERSON;
    properNoun.n_type = edu.emory.clir.clearnlp.coreference.type.NumberType.SINGULAR;
    if (m_maleNames.contains(properNoun.wordFrom)) {
        properNoun.g_type = edu.emory.clir.clearnlp.coreference.type.GenderType.MALE;
        return ;
    }
    if (m_femaleNames.contains(properNoun.wordFrom))
        if (m_maleNames.contains(properNoun.wordFrom))
            properNoun.g_type = edu.emory.clir.clearnlp.coreference.type.GenderType.NEUTRAL;
        else
            properNoun.g_type = edu.emory.clir.clearnlp.coreference.type.GenderType.FEMALE;
        
    else
        properNoun.g_type = edu.emory.clir.clearnlp.coreference.type.GenderType.UNKNOWN;
    
}