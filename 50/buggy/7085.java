@org.auditioner.services.family.member.SqlUpdate(value = "UPDATE FamilyMember " + ("  SET Name=:family.name " + "WHERE id=:id"))
@org.skife.jdbi.v2.sqlobject.customizers.Mapper(value = org.auditioner.services.family.FamilyResultSetMapper.class)
org.auditioner.services.family.member.FamilyMember updateFamilyMember(@org.auditioner.services.family.member.Bind(value = "id")
long familyMemberId, @org.auditioner.services.family.member.BindBean(value = "familyMember")
org.auditioner.services.family.member.FamilyMember familyMember);