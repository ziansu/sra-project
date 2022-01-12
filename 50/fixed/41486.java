@io.gsonfire.annotations.ExposeMethodResult(value = "choiceId")
public java.util.UUID getChoiceId() {
    if ((choice) == null)
        return null;
    
    return choice.getId();
}