private org.gedcom4j.relationship.RelationshipName.RelationshipName getReverseRelationship(org.gedcom4j.relationship.RelationshipName.RelationshipName relationship, org.gedcom4j.relationship.StringWithCustomTags sex) {
    if ("M".equals(sex.getValue())) {
        return relationship.reverseForMale;
    }
    if ("F".equals(sex.getValue())) {
        return relationship.reverseForFemale;
    }
    return relationship.reverseForUnknown;
}