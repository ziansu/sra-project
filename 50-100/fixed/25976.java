@java.lang.Override
public weka.core.TechnicalInformation getTechnicalInformation() {
    weka.core.TechnicalInformation result;
    weka.core.TechnicalInformation additional;
    result = new weka.core.TechnicalInformation(weka.core.TechnicalInformation.Type.INPROCEEDINGS);
    result.setValue(Field.AUTHOR, "Eibe Frank and Stefan Kramer");
    result.setValue(Field.TITLE, "Ensembles of nested dichotomies for multi-class problems");
    result.setValue(Field.BOOKTITLE, "Twenty-first International Conference on Machine Learning");
    result.setValue(Field.YEAR, "2004");
    result.setValue(Field.PUBLISHER, "ACM");
    return result;
}