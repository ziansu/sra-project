public void setOtherProperties(org.collectiveone.modules.model.dto.ModelCardDto cardDto) {
    setStateControl(cardDto.getStateControl());
    setState(org.collectiveone.modules.model.ModelCardState.valueOf(cardDto.getState()));
    if ((cardDto.getTargetDate()) != null)
        setTargetDate(new java.sql.Timestamp(cardDto.getTargetDate()));
    
}