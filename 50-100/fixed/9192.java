@java.lang.Override
public java.util.List<TOutDto> getList(java.lang.String inRequstMapping, TinDto inInDto) {
    java.util.Map<java.lang.String, TOutDto> outDtoMap = new java.util.HashMap<java.lang.String, TOutDto>();
    try {
        getReadService().execute(inRequstMapping, inInDto, outDtoMap);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return new java.util.ArrayList<TOutDto>(outDtoMap.values());
}