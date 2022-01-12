public java.lang.String getColor() {
    boolean expEdit = controller.NavigationController.getInstance().isExpEdit();
    if (expEdit) {
        beans.relation.PatientIllnessScript learnerscript = new controller.NavigationController().getCRTFacesContext().getPatillscript();
        if ((isRuledOutBool()) && ((ruledOut) <= (learnerscript.getStage())))
            return beans.relation.RelationDiagnosis.COLOR_RULEDOUT;
        
        return "#000000";
    }else {
        if (isRuledOutBool())
            return beans.relation.RelationDiagnosis.COLOR_RULEDOUT;
        
        return "#000000";
    }
}