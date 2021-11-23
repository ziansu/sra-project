@java.lang.Override
public weka.core.TechnicalInformation getTechnicalInformation() {
    weka.core.TechnicalInformation result;
    weka.core.TechnicalInformation additional;
    result = new weka.core.TechnicalInformation(weka.core.TechnicalInformation.Type.INPROCEEDINGS);
    additional = result.add(Type.INPROCEEDINGS);
    additional.setValue(Field.AUTHOR, "Eibe Frank and Stefan Kramer");
    additional.setValue(Field.TITLE, "Ensembles of nested dichotomies for multi-class problems");
    additional.setValue(Field.BOOKTITLE, "Twenty-first International Conference on Machine Learning");
    additional.setValue(Field.YEAR, "2004");
    additional.setValue(Field.PUBLISHER, "ACM");
    return result;
}