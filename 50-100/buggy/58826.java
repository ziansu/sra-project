@java.lang.Override
public java.lang.String getDisplayName() {
    try {
        getFields(new me.childintime.childintime.database.entity.spec.couple.studentsport.StudentSportFields[]{ StudentSportFields.STUDENT_ID , StudentSportFields.SPORT_ID });
        return ((getFieldFormatted(StudentSportFields.STUDENT_ID)) + " & ") + (getFieldFormatted(StudentSportFields.SPORT_ID));
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        return "<error>";
    }
}