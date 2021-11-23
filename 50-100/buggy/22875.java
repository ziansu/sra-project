@java.lang.Override
public void readExtendedInfo(de.keyle.knbt.TagCompound info) {
    if (info.containsKeyAs("Variant", de.keyle.knbt.TagInt.class)) {
        setVariant(de.Keyle.MyPet.entity.types.rabbit.MyRabbit.RabbitType.getTypeByID(info.getAs("Variant", de.keyle.knbt.TagByte.class).getByteData()));
    }
    if (info.getCompoundData().containsKey("Baby")) {
        setBaby(info.getAs("Baby", de.keyle.knbt.TagByte.class).getBooleanData());
    }
}