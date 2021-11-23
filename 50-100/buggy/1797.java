@java.lang.Override
public be.rottenrei.android.choregraph.model.ChoreTransport createFromParcel(android.os.Parcel parcel) {
    be.rottenrei.android.choregraph.model.Chore chore = new be.rottenrei.android.choregraph.model.Chore();
    long dbId = parcel.readLong();
    chore.setDbId((dbId == (-1) ? null : dbId));
    chore.setName(parcel.readString());
    chore.setCycleDays(parcel.readInt());
    chore.setLastTimeDone(dbId);
    return new be.rottenrei.android.choregraph.model.ChoreTransport(chore);
}