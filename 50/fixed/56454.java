@java.lang.Override
public boolean handle(java.io.BufferedWriter writer) {
    return cn.edu.fudan.se.dac.FileUtil.eachLine(getDataFile(), new cn.edu.fudan.se.dac.FileUtil.OutputLineHandler(writer), new ConditionFilter(condition, beanClass));
}