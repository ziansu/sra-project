@java.lang.Override
public void onResult(com.google.android.gms.plus.People.LoadPeopleResult peopleData) {
    if ((peopleData.getStatus().getStatusCode()) == (com.google.android.gms.common.api.CommonStatusCodes.SUCCESS)) {
        com.google.android.gms.plus.model.people.PersonBuffer personBuffer = peopleData.getPersonBuffer();
        try {
            int count = personBuffer.getCount();
        } finally {
            personBuffer.close();
        }
    }
}