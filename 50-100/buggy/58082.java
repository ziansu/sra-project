@java.lang.Override
public void create(final edu.stthomas.gps.familyrecipesystem.entity.Member member) throws edu.stthomas.gps.familyrecipesystem.service.DuplicateUserException, edu.stthomas.gps.familyrecipesystem.service.RequiredAttributesEmptyException {
    if (!(member.validateRequiredFields())) {
        throw new edu.stthomas.gps.familyrecipesystem.service.RequiredAttributesEmptyException();
    }
    if ((this.getDao().getMemberByUserName(member.getUserName())) == null) {
        throw new edu.stthomas.gps.familyrecipesystem.service.DuplicateUserException();
    }
    this.getDao().insert(member);
}