void init(android.database.sqlite.SQLiteDatabase db) {
    timber.log.Timber.d("MYDEBUG: init()");
    com.cartlc.tracker.data.TableAddress.Init(db);
    com.cartlc.tracker.data.TableEntry.Init(db);
    com.cartlc.tracker.data.TableEquipment.Init(db);
    com.cartlc.tracker.data.TableCollectionEquipmentEntry.Init(db);
    com.cartlc.tracker.data.TableCollectionEquipmentProject.Init(db);
    com.cartlc.tracker.data.TableNote.Init(db);
    com.cartlc.tracker.data.TableCollectionNoteEntry.Init(db);
    com.cartlc.tracker.data.TableCollectionNoteProject.Init(db);
    com.cartlc.tracker.data.TablePictureCollection.Init(db);
    com.cartlc.tracker.data.TableProjectAddressCombo.Init(db);
    com.cartlc.tracker.data.TableProjects.Init(db);
}