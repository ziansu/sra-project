@java.lang.Override
public boolean accept(ccl.v2_1.cat.CclCodeBlock infos) {
    if ((infos.getKeyword()) == null)
        return false;
    
    if (csy.block.FunctionBlockSystem.DEF_PATTERN.matcher(infos.getKeyword()).matches()) {
        (csy.block.FunctionBlockSystem.count)++;
        this.name = extractName(infos.getKeyword());
        return true;
    }
    return false;
}