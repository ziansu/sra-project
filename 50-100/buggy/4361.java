public void judge(java.util.List<java.lang.Integer> result, java.util.List<java.lang.Integer> corr) {
    if (result == null) {
        feedback += "FAILED. Result is NULL";
    }else
        if (basicgraph.DegreeGrader.printList(result).equals(basicgraph.DegreeGrader.printList(corr))) {
            feedback += ((("FAILED. Expected " + (basicgraph.DegreeGrader.printList(corr))) + ", got ") + (basicgraph.DegreeGrader.printList(result))) + ". ";
        }else {
            feedback += "PASSED.";
            (correct)++;
        }
    
}