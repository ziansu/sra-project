void setUserVariableName(org.catrobat.catroid.formulaeditor.UserVariable userVariable) {
    if (userVariable == null) {
        return null;
    }
    if ((userVariable.getName()) != null) {
        userVariableName = userVariable.getName();
    }else {
        userVariableName = org.catrobat.catroid.common.Constants.NO_VARIABLE_SELECTED;
    }
}