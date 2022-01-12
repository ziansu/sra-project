@java.lang.Override
public int compare(org.sosy_lab.cpachecker.cpa.policyiteration.Template o1, org.sosy_lab.cpachecker.cpa.policyiteration.Template o2) {
    return com.google.common.collect.ComparisonChain.start().compare(o1.getLinearExpression().size(), o2.getLinearExpression().size()).compare(o1.toString(), o2.toString()).result();
}