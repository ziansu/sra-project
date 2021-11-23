public java.lang.String getAge() {
    java.lang.String[] dob = birthday.split("/");
    return getAgeFromDoB(java.lang.Integer.parseInt(dob[2]), java.lang.Integer.parseInt(dob[1]), java.lang.Integer.parseInt(dob[0]));
}