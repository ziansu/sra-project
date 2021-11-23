public void setOtherProperties(org.collectiveone.modules.model.dto.ModelCardDto cardDto) {
    if ((cardDto.getStateControl()) != null) {
        if (cardDto.getStateControl()) {
            setStateControl(cardDto.getStateControl());
            setState(org.collectiveone.modules.model.ModelCardState.valueOf(cardDto.getState()));
        }
    }
    if ((cardDto.getTargetDate()) != null)
        setTargetDate(new java.sql.Timestamp(cardDto.getTargetDate()));
    
}