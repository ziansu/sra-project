@java.lang.Override
public int hashCode() {
    int result = firstName.hashCode();
    result = (31 * result) + (lastName.hashCode());
    result = (31 * result) + (dateOfBirth.hashCode());
    result = (31 * result) + (placeOfBirth.hashCode());
    result = (31 * result) + (nationality.hashCode());
    result = (31 * result) + (educationQualifications.hashCode());
    return result;
}