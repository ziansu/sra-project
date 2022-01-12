@java.lang.Override
public java.lang.String toString() {
    java.lang.StringBuilder result = new java.lang.StringBuilder();
    result.append(groupName).append(" (").append(skills.size()).append(" skills)\n");
    for (com.beimin.eveapi.model.eve.Skill skill : skills) {
        result.append("\t").append(skill).append("\n");
    }
    return result.toString();
}