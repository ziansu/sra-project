@java.lang.Override
public java.lang.String toString() {
    java.lang.String result = (((groupName) + " (") + (skills.size())) + " skills)\n";
    for (com.beimin.eveapi.model.eve.Skill skill : skills) {
        result += ("\t" + skill) + "\n";
    }
    return result;
}