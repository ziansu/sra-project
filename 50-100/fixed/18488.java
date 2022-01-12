private java.lang.String getSkills() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    for (workshop.model.parts.Skill s : drone.getSkills()) {
        if (!(s.getName().equals(workshop.model.DroneBuilder.noskill))) {
            sb.append(s.getName()).append(",  ");
        }
    }
    if ((sb.lastIndexOf(",")) != (-1)) {
        sb.setLength(sb.lastIndexOf(","));
    }
    return sb.toString();
}