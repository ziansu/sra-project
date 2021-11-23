public void setMovementArchetype(final com.github.majora_incarnate.mwo.mechbay.entities.Variant variant) {
    if (variant == null) {
        return ;
    }
    ((javax.swing.border.TitledBorder) (getBorder())).setTitle("Movement Archetype");
    setLabel(this.Label1, "Type", variant.chassisType.movementArchetype.name);
    setLabel(this.Label2, "", "");
    setLabel(this.Label3, "Max Climb", java.lang.String.format("%.1f", variant.chassisType.movementArchetype.maxClimbAngle));
    setLabel(this.Label4, "Min Climb", java.lang.String.format("%.1f", variant.chassisType.movementArchetype.minClimbAngle));
    setBottomRowUsage(false);
}